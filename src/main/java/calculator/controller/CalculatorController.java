package calculator.controller;

import calculator.service.CalculateService;

import java.util.Scanner;

public class CalculatorController {

    private String inputRequest;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("계산식을 입력하세요");
        inputRequest = sc.nextLine();
    }

    public void result() {
        CalculateService calculateService = new CalculateService();

        int cal = calculateService.cal(inputRequest);
        System.out.println("결과는: " + cal + " 입니다.");
    }
}
