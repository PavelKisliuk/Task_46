import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task_46 {
	public static void main(String[] args) {
		String outputPath = "OUTPUT.TXT";
		String inputPath = "INPUT.TXT";
		Rounder test = new Rounder(inputPath);
		try (BufferedWriter output = Files.newBufferedWriter(Paths.get(outputPath))) {
			output.write(test.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Rounder {
	private String[] round = {
			"3",
			"2.7",
			"2.72",
			"2.718",
			"2.7183",
			"2.71828",
			"2.718282",
			"2.7182818",
			"2.71828183",
			"2.718281828",
			"2.7182818285",
			"2.71828182846",
			"2.718281828459",
			"2.7182818284590",
			"2.71828182845905",
			"2.718281828459045",
			"2.7182818284590452",
			"2.71828182845904524",
			"2.718281828459045235",
			"2.7182818284590452354",
			"2.71828182845904523536",
			"2.718281828459045235360",
			"2.7182818284590452353603",
			"2.71828182845904523536029",
			"2.718281828459045235360288",
			"2.7182818284590452353602875"
	};

	private int index;

	public Rounder(String path) {
		try (final BufferedReader input = Files.newBufferedReader(Paths.get(path))) {
			String data = input.readLine();
			index = Integer.parseInt(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return round[index];
	}
}