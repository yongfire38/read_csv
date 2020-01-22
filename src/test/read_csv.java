package test;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;

import com.opencsv.CSVReader;

public class read_csv {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {
			InputStreamReader is = new InputStreamReader(new FileInputStream("data/project_code.csv"), "EUC-KR");
			//첫 줄은 제외하고 읽는다
			CSVReader reader = new CSVReader(is, ',', '"', 1);
			List<String[]> list = reader.readAll();

			for (String[] str : list) {
				System.out.println();
				for (String s : str) {
					System.out.print(s + ",");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
