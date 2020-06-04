package iterator;

import lombok.Data;

/**
 * @author: jianyufeng
 * @description: 系
 * @date: 2020/6/3 15:24
 */
@Data
public class Department {
    private String name;
    public Department(String name) {
        this.name = name;
    }
}
