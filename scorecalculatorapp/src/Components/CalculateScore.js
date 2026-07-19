import "../Stylesheets/mystyle.css";
function CalculateScore() {
    const name = "Ashwin";
    const school = "REVA University";
    const total = 500;
    const goal = 450;

    const average = total / 5;

    return (
        <div>
            <h2>Student Score Calculator</h2>
            <p><b>Name:</b> {name}</p>
            <p><b>School:</b> {school}</p>
            <p><b>Total Marks:</b> {total}</p>
            <p><b>Goal:</b> {goal}</p>
            <p><b>Average:</b> {average}</p>
        </div>
    );
}

export default CalculateScore;