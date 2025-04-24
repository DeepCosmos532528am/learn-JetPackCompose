# learn-JetPackCompose
QuickHelp: Row_Column_Box_layouts.kt,

🧱 Row and Column in Jetpack Compose
🔹 What are Row and Column?
Row and Column are composable layout components in Jetpack Compose.

They are used to arrange UI elements either horizontally (Row) or vertically (Column).
🔸 Syntax

➤ Row
![Screenshot 2025-04-25 020937.png](../../Pictures/Screenshots/Screenshot%202025-04-25%20020937.png)

➤ Column
![Screenshot 2025-04-25 021109.png](../../Pictures/Screenshots/Screenshot%202025-04-25%20021109.png)

⚙️ Key Parameters
      Parameter       |      Used In         |          Purpose
horizontalArrangement |        Row           | Arranges children horizontally
verticalArrangement   |       Column         | Arranges children vertically
horizontalAlignment   |       Column         | Aligns children horizontally inside column
verticalAlignment     |        Row           | Aligns children vertically inside row

🔍 Notes
You can only use one Arrangement and one Alignment per axis.

To center the Row or Column inside the screen, wrap them inside a Box with:
![Screenshot 2025-04-25 021128.png](../../Pictures/Screenshots/Screenshot%202025-04-25%20021128.png)

📌 Common Arrangements
![Screenshot 2025-04-25 021141.png](../../Pictures/Screenshots/Screenshot%202025-04-25%20021141.png)



Get the idea of Arrangements and Alignments for Row, Column , and Box layout (Box have Alignment only , not arrangements like Column and Row layouts) 

![Screenshot 2025-04-25 015504.png](../../Pictures/Screenshots/Screenshot%202025-04-25%20015504.png)

✅ Best Practices
Use modifier = Modifier.fillMaxSize() to make sure layout fills available space, allowing alignment and arrangement to work properly.

Wrap multiple composables in Column or Row instead of placing them separately in setContent.