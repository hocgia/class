<?php

namespace App\Http\Controllers;

use App\Student;
use Illuminate\Http\Request;

class StudentController extends Controller
{
    public function show() {
        $students = Student::orderBy("name","ASC")->paginate(20);
        return view('home', compact('students'));
    }

    public function create()
    {
        return view('student-create');
    }

    public function store(Request $request)
    {
        $rules = [
            "name" => "required|string|max:255",
            "age" => "required|numeric|min:10|max:100",
            "address" => "required|string|max:255",
            "telephone" => "required|numeric|min:10"
        ];
        $this->validate($request, $rules);
        try {
            Student::create([
                "name" => $request->get("name"),
                "age" => $request->get("age"),
                "address" => $request->get("address"),
                "telephone" => $request->get("telephone"),
            ])->save();
        } catch (\Exception $e) {
            die($e->getMessage());
        }
        return redirect('/home');
    }
}
