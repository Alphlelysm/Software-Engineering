import { useEffect, useState } from "react";
import { getCourses } from "../services/api";

export default function Courses() {
  const [courses, setCourses] = useState([]);

  useEffect(() => {
    getCourses().then(setCourses);
  }, []);

  return (
    <div>
      <h2>Available Courses</h2>
      <ul>
        {courses.map(c => (
          <li key={c.id}>{c.title} - {c.instructor}</li>
        ))}
      </ul>
    </div>
  );
}
