export default function CourseCard({ title, instructor }) {
  return (
    <div className="bg-white shadow-md rounded-xl p-4 border hover:shadow-lg transition">
      <h3 className="text-lg font-semibold text-gray-800">{title}</h3>
      <p className="text-gray-500">Instructor: {instructor}</p>
      <button className="mt-2 bg-blue-600 text-white px-3 py-1 rounded-lg hover:bg-blue-700">
        Enroll
      </button>
    </div>
  );
}
