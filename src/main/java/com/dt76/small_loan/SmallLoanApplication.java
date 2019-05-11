package com.dt76.small_loan;

        import org.mybatis.spring.annotation.MapperScan;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dt76.small_loan.mapper")
public class SmallLoanApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallLoanApplication.class, args);
    }

}
