// Mock API until backend is ready
export const getCourses = async () => {
  return [
    { id: 1, title: "Software Engineering", instructor: "Dr. Smith" },
    { id: 2, title: "Database Systems", instructor: "Prof. Johnson" },
    { id: 3, title: "Web Development", instructor: "Ms. Lee" },
  ];
};

// Real API
/*
export const getCourses = async () => {
  const res = await fetch("http://localhost:8080/api/courses");
  return res.json();
};
*/
