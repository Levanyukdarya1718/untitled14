
void main() {
    try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        System.err.println( e.getMessage());
    }
    try (
            // Создаем BufferedReader для чтения из source.txt
            BufferedReader reader = new BufferedReader(new FileReader("source.txt"));

            // Создаем BufferedWriter для записи в result.txt
            // FileWriter с одним параметром перезаписывает файл, если он существует
            // Если файла нет - он будет создан
            BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"))
    ) {
        String currentLine;
        int count = 0; // Счетчик записанных строк (опционально)

        // Построчно читаем исходный файл
        while ((currentLine = reader.readLine()) != null) {
            // Проверяем условие: длина строки больше 10 символов
            if (currentLine.length() > 10) {
                // Записываем строку в новый файл
                writer.write(currentLine);
                writer.newLine(); // Добавляем разделитель строк
                count++;
            }
        }

        // Выводим статистику (опционально)
        System.out.println("Записано строк: " + count);

    } catch (IOException e) {
        // Обрабатываем возможные ошибки ввода-вывода
        System.err.println("Произошла ошибка: " + e.getMessage());

    }
}
