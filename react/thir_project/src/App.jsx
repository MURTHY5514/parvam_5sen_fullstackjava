import "./App.css";
import { CharLength } from "./components/CharLength";
import { Counter } from "./components/Counter";
function App() {
  return (
    <>
      <h1>Use State Hook</h1>
      <Counter /> <br />
      <CharLength />
    </>
  );
}

export default App;
