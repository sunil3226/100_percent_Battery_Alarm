<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>🔋 100% Battery Alarm - Android App</title>
  <style>
    body {
      font-family: "Segoe UI", sans-serif;
      background-color: #fefefe;
      color: #333;
      padding: 40px;
      margin: 0;
    }
    .container {
      max-width: 850px;
      margin: auto;
      background: #fff;
      padding: 30px;
      border-radius: 12px;
      box-shadow: 0 0 16px rgba(0, 0, 0, 0.1);
    }
    h1, h2 {
      color: #0277BD;
    }
    h1 {
      font-size: 36px;
      margin-bottom: 20px;
    }
    h2 {
      margin-top: 40px;
    }
    ul {
      line-height: 1.8;
      padding-left: 20px;
    }
    .center {
      text-align: center;
      margin-top: 50px;
      font-size: 20px;
      font-weight: 500;
      color: #388E3C;
    }
    a {
      color: #0277BD;
      text-decoration: none;
    }
    a:hover {
      text-decoration: underline;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>🔋 100% Battery Alarm - Android App</h1>
    <p><strong>100% Battery Alarm</strong> is a lightweight and helpful Android utility app that alerts you when your phone battery is fully charged. Save energy, protect your battery health, and avoid overcharging with a simple and intuitive interface.</p>

    <h2>⚙️ Features</h2>
    <ul>
      <li>Battery level detection in real-time</li>
      <li>Automatic alarm when battery reaches 100%</li>
      <li>Custom ringtone for alert</li>
      <li>Vibration support for additional notification</li>
      <li>“Stop Ringing” button to easily silence the alert</li>
      <li>Displays charging type: USB, AC, or Wireless</li>
      <li>Clean UI with percentage display and status</li>
    </ul>

    <h2>🛠️ Technologies Used</h2>
    <ul>
      <li><strong>Kotlin</strong> - Programming language</li>
      <li><strong>Android SDK</strong></li>
      <li><strong>BroadcastReceiver</strong> - for battery status detection</li>
      <li><strong>MediaPlayer</strong> & <strong>Vibrator</strong> API</li>
      <li><strong>Android Studio</strong> - IDE</li>
    </ul>

    <h2>🚀 How It Works</h2>
    <ul>
      <li>The app monitors battery changes using a <code>BroadcastReceiver</code>.</li>
      <li>When battery reaches 100% and the device is still charging, the app:
        <ul>
          <li>Plays a ringtone in a loop</li>
          <li>Triggers vibration alerts</li>
          <li>Displays “Stop Ringing” button</li>
        </ul>
      </li>
      <li>When “Stop Ringing” is pressed, the sound and vibration stop.</li>
      <li>Battery and charging status are shown on the main screen.</li>
    </ul>

    <h2>📦 How to Use</h2>
    <ul>
      <li>Clone the repo using: <code>git clone https://github.com/yourusername/100BatteryAlarm.git</code></li>
      <li>Open the project in Android Studio</li>
      <li>Connect your Android device or run an emulator</li>
      <li>Build and run the app</li>
    </ul>

    <h2>📫 Contact</h2>
    <ul>
      <li><strong>Author:</strong> Sunil</li>
      <li><strong>GitHub:</strong> <a href="https://github.com/Sunil3226" target="_blank">Sunil3226</a></li>
    </ul>

    <p class="center">🔋 Stay charged. Stay safe. Save energy!</p>
    <p class="center">✨ Happy Learning!</p>
  </div>
</body>
</html>
