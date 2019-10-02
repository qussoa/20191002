package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.domain.StudentVO;
import com.biz.grade.utill.ScoreIDX;

public class ScoreServiceV2 {

	private Map<String, ScoreVO> scList;

	public ScoreServiceV2() {
		scList = new TreeMap<String, ScoreVO>();
	}

	public Map<String, ScoreVO> getScList() {
		return this.scList;
	}

	public void read(String scoreFileName) throws Exception {
		FileReader fileReader;
		BufferedReader buffer;

		fileReader = new FileReader(scoreFileName);
		buffer = new BufferedReader(fileReader);

		String reader = new String();
		while (true) {

			reader = buffer.readLine();
			if (reader == null)
				break;
			String[] scs = reader.split(":");

			try {
				ScoreVO scVO = new ScoreVO(scs[ScoreIDX.NUM], Integer.valueOf(scs[ScoreIDX.KOR]),
						Integer.valueOf(scs[ScoreIDX.ENG]), Integer.valueOf(scs[ScoreIDX.MATH]));
				scList.put(scs[ScoreIDX.NUM], scVO);
			} catch (Exception e) {
				System.out.println(scs[ScoreIDX.NUM] + "학생성적확인");
			} // try end
		} // while end
		buffer.close();
		fileReader.close();

	}

	public void list() {
	
		Set<String> _s = scList.keySet();
		Iterator<String> _list = scList.keySet().iterator();

		System.out.println("===================================");
		System.out.println("성적일람표");
		System.out.println("===================================");
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("-----------------------------------");

		while (_list.hasNext()) {
			ScoreVO scVO = scList.get(_list.next());
			System.out.print(scVO.getNum() + "\t");
			System.out.print(scVO.getKorScore() + "\t");
			System.out.print(scVO.getEngScore() + "\t");
			System.out.print(scVO.getMathScore() + "\n");
		} // while end
		System.out.println("===================================");

	}// list end

	public void total() {
		Set<String> keys = scList.keySet();

		for (String key : keys) {
			ScoreVO scVO = scList.get(key);
			int total = scVO.getKorScore();
			total += scVO.getEngScore();
			total += scVO.getMathScore();
			scVO.setSumScore(total);
			scVO.setAverage(total / 3);
		}

	}

	public void listTotal() {
		Set<String> keys = scList.keySet();
		System.out.println("==========================");
		System.out.println("총점리스트");
		System.out.println("==========================");
		System.out.println("학번\t총점\t평균");
		System.out.println("--------------------------");
		for (String key : keys) {
			ScoreVO sVO = scList.get(key);
			System.out.printf("%5s\t%5d\t%4.1f\n", sVO.getNum(), sVO.getSumScore(), sVO.getAverage());
		}
		System.out.println("=========================");

	}// listTotal end

	public void rank() {
		/*
		 * 1. Map 데이터에서 value 전체를 추출 list(sortList) 변환
		 * 2. Map<String, ScoreVO> type으로 데이터를 가지고 있는
		 *    scList값을 list type인 soreList로 변환
		 * 3. generic list<generic> : list 가 어떤 type의 데이터들을
		 * 	  가지고 있을것인가를 명시
		 * 4. Map 형태를 List로 변환시킬때는 List<Map.Entry<>> 형태로 선언
		 */
		List<Map.Entry<String, ScoreVO>> sortList 
		= new LinkedList<Map.Entry<String, ScoreVO>>(scList.entrySet());

		
		Collections.sort(sortList, new Comparator<Map.Entry<String, ScoreVO>>() {

			@Override
			public int compare(Entry<String, ScoreVO> o1, Entry<String, ScoreVO> o2) {
				// o2.getValue()
				// list 형태로 바뀐 Map에서 VO를 추출하는 method
				return  o2.getValue().getSumScore() - o1.getValue().getSumScore();
			}
		});
		int rank = 0;
		for(Map.Entry<String, ScoreVO> vo : sortList) {
			vo.getValue().setRank(++rank);
			//System.out.println(vo.getValue().toString());
		}
	}
}
