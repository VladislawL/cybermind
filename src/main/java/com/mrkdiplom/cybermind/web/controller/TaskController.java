package com.mrkdiplom.cybermind.web.controller;

import com.mrkdiplom.cybermind.core.service.task.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TaskController {

    private TaskService taskService;

    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public String tasksPage(Model model) {
        model.addAttribute("tasks", taskService.getAll());
        return "tasks";
    }

    @Autowired
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }
}
