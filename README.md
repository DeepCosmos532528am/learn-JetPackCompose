<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Learn Jetpack Compose</title>
</head>
<body>
    <h1>Learn Jetpack Compose</h1>
    <h2>QuickHelp: Row_Column_Box_layouts.kt</h2>
    <h3> Row and Column in Jetpack Compose </h3>
  <h4>🔹 What are Row and Column?</h4>
    <p>Row and Column are composable layout components in Jetpack Compose.</p>
    <p>They are used to arrange UI elements either horizontally (Row) or vertically (Column).</p>
                <h4>🔸 Syntax</h4>
      <h5>➤ Row</h5>
                <img src="C:\Users\LOQ\Pictures\Screenshots\Screenshot 2025-04-25 015504.png" alt="Row Layout" width="500">
<h5>➤ Column</h5>
                <img src="../../Pictures/Screenshots/Screenshot%202025-04-25%20021109.png" alt="Column Layout" width="500">
<h4>⚙️ Key Parameters</h4>
                <table border="1" cellpadding="5">
                    <thead>
                        <tr>
                            <th>Parameter</th>
                            <th>Used In</th>
                            <th>Purpose</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>horizontalArrangement</td>
                            <td>Row</td>
                            <td>Arranges children horizontally</td>
                        </tr>
                        <tr>
                            <td>verticalArrangement</td>
                            <td>Column</td>
                            <td>Arranges children vertically</td>
                        </tr>
                        <tr>
                            <td>horizontalAlignment</td>
                            <td>Column</td>
                            <td>Aligns children horizontally inside column</td>
                        </tr>
                        <tr>
                            <td>verticalAlignment</td>
                            <td>Row</td>
                            <td>Aligns children vertically inside row</td>
                        </tr>
                    </tbody>
                </table>
       <h4>🔍 Notes</h4>
                <p>You can only use one Arrangement and one Alignment per axis.</p>
 <h4>To center the Row or Column inside the screen, wrap them inside a Box with:</h4>
                <img src="../../Pictures/Screenshots/Screenshot%202025-04-25%20021128.png" alt="Center Row and Column" width="500">
<h4>📌 Common Arrangements</h4>
                <img src="../../Pictures/Screenshots/Screenshot%202025-04-25%20021141.png" alt="Common Arrangements" width="500">
<h4>Get the idea of Arrangements and Alignments for Row, Column, and Box layout (Box have Alignment only, not arrangements like Column and Row layouts)</h4>
                <img src="../../Pictures/Screenshots/Screenshot%202025-04-25%20015504.png" alt="Row Layout" width="500">
<h4>✅ Best Practices</h4>
                <ul>
                    <li>Use <code>modifier = Modifier.fillMaxSize()</code> to make sure layout fills available space, allowing alignment and arrangement to work properly.</li>
                    <li>Wrap multiple composables in Column or Row instead of placing them separately in setContent.</li>
                </ul>

</body>
</html>


  