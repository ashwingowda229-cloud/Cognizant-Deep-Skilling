import React from "react";
import { ListOfPlayers, ScoreBelow70 } from "./ListOfPlayers";
import {
  IndianTeam,
  OddPlayers,
  EvenPlayers,
  IndianPlayers,
  ListOfIndianPlayers
} from "./IndianPlayers";

function App() {

  var flag = true;

  if (flag === true) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListOfPlayers />

        <hr />

        <h1>List of Players having Scores Less than 70</h1>
        <ScoreBelow70 />
      </div>
    );
  } else {
    return (
      <div>
        <h1>Indian Team</h1>

        <h2>Odd Players</h2>
        {OddPlayers(IndianTeam)}

        <hr />

        <h2>Even Players</h2>
        {EvenPlayers(IndianTeam)}

        <hr />

        <h1>List of Indian Players Merged</h1>
        <ListOfIndianPlayers IndianPlayers={IndianPlayers} />
      </div>
    );
  }
}

export default App;