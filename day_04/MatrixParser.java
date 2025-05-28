package day_04;

import java.util.ArrayList;
import java.util.List;

public class MatrixParser {

	 public static List<List<Integer>> getRows(String input) {
	        List<List<Integer>> rows = new ArrayList<>();
	        String[] lines = input.strip().split("\n");

	        for (String line : lines) {
	            String[] nums = line.trim().split("\\s+");
	            List<Integer> row = new ArrayList<>();
	            for (String num : nums) {
	                row.add(Integer.parseInt(num));
	            }
	            rows.add(row);
	        }

	        return rows;
	    }

	    public static List<List<Integer>> getColumns(List<List<Integer>> rows) {
	        List<List<Integer>> columns = new ArrayList<>();

	        if (rows.isEmpty()) return columns;

	        int columnCount = rows.get(0).size();

	        for (int col = 0; col < columnCount; col++) {
	            List<Integer> column = new ArrayList<>();
	            for (List<Integer> row : rows) {
	                column.add(row.get(col));
	            }
	            columns.add(column);
	        }

	        return columns;
	    }

	    public static void main(String[] args) {
	        String input = """
	            9 8 7
	            5 3 2
	            6 6 7
	        """;

	        System.out.println("🌈 Righe:");
	        List<List<Integer>> rows = getRows(input);
	        for (List<Integer> row : rows) {
	            System.out.println(row);
	        }

	        System.out.println("\n🌈 Colonne:");
	        List<List<Integer>> columns = getColumns(rows);
	        for (List<Integer> col : columns) {
	            System.out.println(col);
	        }
	    }
	}