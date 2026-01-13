
void main() {
    try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        System.err.println( e.getMessage());
    }
    //----------------------------------------------------------------------------
    try (
            BufferedReader reader = new BufferedReader(new FileReader("source.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"))
    ) {
        String currentLine;
        int count = 0;
        while ((currentLine = reader.readLine()) != null) {
          if (currentLine.length() > 10) {
              writer.write(currentLine);
                writer.newLine();
                count++;
            }
        }
        System.out.println("Записано строк: " + count);

    } catch (IOException e) {
        System.err.println("Произошла ошибка: " + e.getMessage());

    }
}
