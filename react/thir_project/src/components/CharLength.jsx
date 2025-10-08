import React, { useState } from "react";

export const CharLength = () => {
  const [userInput, setUserInput] = useState(0);
  return (
    <>
      <textarea
        name="address"
        id="address"
        rows={6}
        cols={16}
        onChange={(e) => setUserInput(e.target.value)}
      ></textarea>
      <div>Character Count: {userInput.length}</div>
    </>
  );
};
