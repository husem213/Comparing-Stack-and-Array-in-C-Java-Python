# Comparing-Stack-and-Array-in-C-Java-Python
Simple programs written in C++/Java/Python to show the differences between using stacks and arrays in each language

Code Explanation (En):

All files demonstrate string/array reversal using different approaches:
Java & Python Array Files (MyArray.java, MyArray.py, MyList.cpp):
Reverse an array by swapping elements from both ends
Example: ["Yellow", "Blue", "Black"] → ["Black", "Blue", "Yellow"]

Stack Files (MyStack.cpp, Mystack.java, Mystack.py):
Reverse strings using stack's LIFO (Last-In-First-Out) property
Example: "Hello" → "olleH"

Key Differences: Arrays vs Stacks

Arrays (Used in Array files)
Access: Random access (any element anytime)
Structure: Fixed size (usually)
Operations: Direct element manipulation
Reversal Method: Swap elements from both ends

Stacks (Used in Stack files)
Access: Only top element (LIFO - Last In, First Out)
Structure: Dynamic size
Operations: Only push() and pop()
Reversal Method: Natural reversal through LIFO property

Simple Analogy:
Array → Like a bookshelf (access any book directly)
Stack → Like a stack of plates (only top plate accessible)

How Each Reverses:
Arrays: Swap first↔last, second↔second-last, etc.
Stacks: Push all elements, then pop them (automatically reverses order)

#################################################################################################################

[Ru]
Объяснение кода:

Все файлы демонстрируют переворот строк/массивов разными способами:
Файлы с массивами на Java и Python (MyArray.java, MyArray.py, MyList.cpp):
Переворачивают массив путем обмена элементов с обоих концов
Пример: ["Yellow", "Blue", "Black"] → ["Black", "Blue", "Yellow"]

Файлы со стеками (MyStack.cpp, Mystack.java, Mystack.py):
Переворачивают строки используя свойство LIFO стека (Last-In-First-Out - Последним пришел, первым ушел)
Пример: "Hello" → "olleH"

Ключевые различия: Массивы vs Стеки

Массивы (Используются в файлах с массивами)
Доступ: Произвольный доступ (любой элемент в любое время)
Структура: Фиксированный размер (обычно)
Операции: Прямое manipulation элементов
Метод переворота: Обмен элементов с обоих концов

Стеки (Используются в файлах со стеками)
Доступ: Только к верхнему элементу (LIFO - Последним пришел, первым ушел)
Структура: Динамический размер
Операции: Только push() и pop()
Метод переворота: Естественный переворот через свойство LIFO

Простая аналогия
Массив → Как книжная полка (доступ к любой книге напрямую)
Стек → Как стопка тарелок (только верхняя тарелка доступна)

Как каждый переворачивает:
Массивы: Обмен первый↔последний, второй↔предпоследний и т.д.
Стеки: Поместить все элементы, затем извлечь их (автоматически меняет порядок)
