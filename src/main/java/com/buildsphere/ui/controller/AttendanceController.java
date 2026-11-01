package com.buildsphere.ui.controller;

import com.buildsphere.ui.model.Attendance;
import com.buildsphere.ui.service.AttendanceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/attendance")
public class AttendanceController {

    private final AttendanceService attendanceService;

    public AttendanceController(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }

    @GetMapping
    public String attendance(Model model) {
        model.addAttribute("attendanceList", attendanceService.getAllAttendance());
        model.addAttribute("attendance", new Attendance());
        return "attendance";
    }

    @PostMapping("/save")
    public String saveAttendance(@ModelAttribute Attendance attendance) {
        attendanceService.saveAttendance(attendance);
        return "redirect:/attendance";
    }

    @GetMapping("/delete/{id}")
    public String deleteAttendance(@PathVariable Long id) {
        attendanceService.deleteAttendance(id);
        return "redirect:/attendance";
    }
}