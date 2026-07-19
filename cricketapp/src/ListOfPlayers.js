import React from "react";

const players = [
  { name: "Jack", score: 50 },
  { name: "Michael", score: 70 },
  { name: "John", score: 40 },
  { name: "Am", score: 61 },
  { name: "Elizabeth", score: 61 },
  { name: "Sachin", score: 95 },
  { name: "Dhoni", score: 100 },
  { name: "Virat", score: 84 },
  { name: "Jadeja", score: 64 },
  { name: "Raina", score: 75 },
  { name: "Rohit", score: 80 }
];

export function ListOfPlayers() {
  return (
    <div>
      {players.map((item, index) => (
        <p key={index}>
          Mr. {item.name} <span>{item.score}</span>
        </p>
      ))}
    </div>
  );
}

export function ScoreBelow70() {
  const players70 = players.filter((item) => item.score <= 70);

  return (
    <div>
      {players70.map((item, index) => (
        <p key={index}>
          Mr. {item.name} <span>{item.score}</span>
        </p>
      ))}
    </div>
  );
}