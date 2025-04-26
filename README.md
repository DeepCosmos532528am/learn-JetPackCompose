<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>Learn Jetpack Compose</h1>
    <h2>🚀QuickHelp: Row_Column_Box_layouts.kt</h2>
    <h3> Row and Column in Jetpack Compose </h3>
  <h4>🔹 What are Row and Column?</h4>
    <p>Row and Column are composable layout components in Jetpack Compose.</p>
    <p>They are used to arrange UI elements either horizontally (Row) or vertically (Column).</p>
                <h4>🔸 Syntax</h4>
      <h5>➤ Row</h5>
    <code style="color: Orange">Row(
    modifier = Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceBetween,
    verticalAlignment = Alignment.CenterVertically
) {
    Text("Item 1")
    Text("Item 2")
}</code>
<h5>➤ Column</h5>
               <code>Column(
    modifier = Modifier.fillMaxHeight(),
    verticalArrangement = Arrangement.SpaceEvenly,
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Text("Item A")
    Text("Item B")
}</code>
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
                <code>Box(
    modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center
) {
    Row / Column {
        // Add your composable elements here
    }
}</code>
<h4>📌 Common Arrangements</h4>
               <details>val arrangementTypes = listOf(
    Arrangement.Start,
    Arrangement.End,
    Arrangement.Center,
    Arrangement.SpaceBetween,
    Arrangement.SpaceAround,
    Arrangement.SpaceEvenly
)</details>
<h4>Get the idea of Arrangements and Alignments for Row, Column, and Box layout (Box have Alignment only, not arrangements like Column and Row layouts)</h4>
<code>Axis:
Alignment = Cross Axis (Row = Vertical, Column = Horizontal)
Arrangement = Main Axis (Row = Horizontal, Column = Vertical)<br>  
Row:
RowAlignment: Top, CenterVertically, Bottom.
RowArrangement: Start, Center, End, SpaceBetween, SpaceAround, SpaceEvenly,
                  Absolute.Left, Absolute.Right, Absolute.Center,
                  Absolute.SpaceBetween, Absolute.SpaceAround, Absolute.SpaceEvenly.<br>  
Column:
ColumnAlignment: Start, CenterHorizontally, End.
ColumnArrangement: Top, Center, Bottom, SpaceEvenly, SpaceBetween, SpaceAround.
Box:
BoxAlignment: TopStart, TopCenter, TopEnd, BottomStart, BottomCenter, BottomEnd,
                Center, CenterStart, CenterEnd.</code>
<h4>✅ Best Practices</h4>
                <ul>
                    <li>Use <code>modifier = Modifier.fillMaxSize()</code> to make sure layout fills available space, allowing alignment and arrangement to work properly.</li>
                    <li>Wrap multiple composables in Column or Row instead of placing them separately in setContent.</li>
                </ul>
<hr style="border: 3px solid #000;">
<h2>🚀 QuickHelp:LearnButtonAndImage.kt</h2>

<p> Understand Button, Image & Toast with Example</p>
 <p>This demo shows how to use <strong>Button</strong>, <strong>Image</strong>, and <strong>Toast</strong> in Jetpack Compose — the basic UI components used in almost all Android apps.</p>

<hr>
    <h2>🔘 Button in Jetpack Compose</h2>
    <p>A <strong>Button</strong> allows users to perform actions. For example, in Amazon, the <em>"Buy Now"</em> button places your order.</p>
 <h4>✅ Code:</h4>
    <pre><code>
Button(onClick = { /* show toast */ }) {
Text("Download")
}</code></pre>
<h4>🧾 Parameters explained:</h4>
    <ul>
        <li><strong>onClick:</strong> What should happen when the button is clicked (e.g., show a Toast).</li>
        <li><strong>enabled:</strong> Whether the button is active. If <code>false</code>, it's greyed out and not clickable.</li>
        <li><strong>shape:</strong> Defines the shape of the button — like rounded corners.</li>
        <li><strong>colors:</strong> Sets the background and text colors, including disabled colors.</li>
    </ul>
<h4>🎨 Example of setting colors:</h4>
    <pre><code>
colors = ButtonDefaults.buttonColors(
containerColor = Color.Blue,
contentColor = Color.Yellow,
disabledContainerColor = Color.LightGray,
disabledContentColor = Color.Black
)
</code></pre>
 <h4>🧠 What does <code>enabled</code> do?</h4>
    <p>If you want to show the button but not let the user click it (like when a form isn't complete), you can use <code>enabled = false</code>. You can change it to <code>true</code> later when ready.</p>
<h4>📱 Real App Examples:</h4>
    <ul>
        <li><strong>Amazon</strong> – “Buy Now” button is disabled when out of stock.</li>
        <li><strong>Zomato</strong> – “Place Order” is only enabled when all info is filled.</li>
    </ul>
<hr>
 <h2>🖼️ Image in Jetpack Compose</h2>
    <p>Images help make the UI attractive and informative. You can load local images from the <code>drawable</code> folder.</p>
<h4>✅ Code:</h4>
    <pre><code>Image(
painter = painterResource(id = R.drawable.daco),
contentDescription = "Image",
modifier = Modifier.border(color = Color.Black, width = 2.dp, shape = CircleShape)
)
</code></pre>
 <h4>🧾 Parameters explained:</h4>
    <ul>
        <li><strong>painter:</strong> Loads the image from resources.</li>
        <li><strong>contentDescription:</strong> Describes the image for accessibility tools.</li>
        <li><strong>modifier:</strong> Adds styling like border, padding, shape, etc.</li>
    </ul>
<h4>📱 Real App Examples:</h4>
    <ul>
        <li><strong>Instagram</strong> – Circular profile pictures with borders.</li>
        <li><strong>LinkedIn</strong> – Profile photos with soft white borders.</li>
    </ul>
 <hr>
<h2>🔔 Toast in Jetpack Compose</h2>
    <p>A <strong>Toast</strong> is a small message popup used to give feedback, like “Message Sent” or “Downloading…”</p>
<h4>✅ Code:</h4>
    <pre><code>val context = LocalContext.current.applicationContext
Toast.makeText(context, "Downloading...", Toast.LENGTH_SHORT).show()
</code></pre>
 <h4>🧾 Parameters explained:</h4>
    <ul>
        <li><strong>context:</strong> Where the Toast should be shown (usually current screen).</li>
        <li><strong>message:</strong> Text shown in the popup.</li>
        <li><strong>duration:</strong> Time Toast stays visible (<code>SHORT</code> or <code>LONG</code>).</li>
    </ul>
<h4>📱 Real App Examples:</h4>
    <ul>
        <li><strong>WhatsApp</strong> – “Message deleted” after deleting a chat message.</li>
        <li><strong>Paytm</strong> – “Copied to clipboard” after copying UPI ID.</li>
    </ul><hr>
<h2>🧱 Using Image and Button Together</h2>
    <p>We can place both Image and Button inside a <code>Column</code> to align them one below the other.</p>
<h4>✅ Code:</h4>
    <pre><code>
Column(
modifier = Modifier.fillMaxSize(),
verticalArrangement = Arrangement.Center,
horizontalAlignment = Alignment.CenterHorizontally
) {
Learn_Image()
Learn_Button()
}
</code></pre>
<h4>📱 Real App Examples:</h4>
    <ul>
        <li><strong>Spotify</strong> – Album image with Play button below it.</li>
        <li><strong>YouTube</strong> – Thumbnail with “Watch Later” or “Download” button below.</li>
    </ul>
<h2>📌 Final Summary</h2>
    <table border="1" cellpadding="8" cellspacing="0">
        <tr>
            <th>Feature</th>
            <th>Real-Life Usage</th>
        </tr>
        <tr>
            <td><strong>Button</strong></td>
            <td>Submit, Buy, Play, Order actions</td>
        </tr>
        <tr>
            <td><strong>Image</strong></td>
            <td>Profile pictures, banners, product images</td>
        </tr>
        <tr>
            <td><strong>Toast</strong></td>
            <td>Quick messages like “Saved”, “Copied”, “Deleted”</td>
        </tr>
    </table>
<hr style="border: 3px solid #000;">
<h2>🚀QuickHelp:State4.kt</h2>
<div>
<h2>Word-by-Word Breakdown:</h2>
    <table border="1">
        <tr>
           <th>Part</th>
            <th>Meaning in Easy Words</th>
        </tr>
        <tr>
            <td><code>var</code></td>
            <td>I am creating a <strong>changeable</strong> variable (value can be updated).</td>
        </tr>
        <tr>
            <td><code>name</code></td>
            <td>The <strong>name</strong> of my variable is <code>name</code>.</td>
        </tr>
        <tr>
            <td><code>by</code></td>
            <td>I am <strong>giving the work</strong> (getting and setting the value) to a helper automatically. (No need to write <code>.value</code> manually.)</td>
        </tr>
        <tr>
            <td><code>remember</code></td>
            <td>I am telling Compose: <strong>"Please save this value and don't forget it when the screen updates."</strong></td>
        </tr>
        <tr>
            <td><code>{}</code> (curly brackets)</td>
            <td>Inside, I am <strong>creating</strong> the real value.</td>
        </tr>
        <tr>
            <td><code>mutableStateOf("")</code></td>
            <td>I am creating a <strong>changeable value</strong> (State) with <strong>initial value as an empty string ("")</strong>.</td>
        </tr>
    </table>
<h3>Very Short Meaning:</h3>
    <p><strong>"I am creating a changeable variable called <code>name</code>, which will keep its value safe across screen updates, and I can use it easily without extra code."</strong></p>
<h3>How it Works:</h3>
    <ul>
        <li>When the app redraws the screen, <code>name</code> will not lose its value.</li>
        <li>And you can simply use <code>name</code> like a normal string!</li>
    </ul>
 <h3>Real Life Example - Popular App:</h3>
    <p>Imagine the "WhatsApp" app, where you type a message. If you are typing and the screen updates (e.g., keyboard pops up or UI refreshes), the message you typed is remembered, and the text you are typing doesn't get lost. This is similar to how <code>remember</code> works — it saves the message (or value) you are working with, even when the screen refreshes.</p>
</div>

</body>
</html>


  