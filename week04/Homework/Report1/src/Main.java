public class Main {
    public static void main(String[] args) {
        Depart[] departs = new Depart[]{
                new Depart('0',""),
                new Depart('1',"경리과"),
                new Depart('2',"인사과"),
                new Depart('2',"영업팀"),
                new Depart('2',"생산과"),
                new Depart('2',"A/S팀")
        };
        Employee[] employees=new Employee[]{
                new Employee(11111,"홍길동",departs[1],false,'1','2',200000),
                new Employee(11111,"홍닐동",departs[4],false,'2','3',300000),
                new Employee(11111,"홍일동",departs[2],false,'3','5',300000),
                new Employee(11111,"홍실동",departs[3],true,'3','3',250000),
                new Employee(11111,"홍진동",departs[5],true,'2','4',250000),
                new Employee(11111,"홍인동",departs[1],false,'2','2',300000),
                new Employee(11111,"홍빈동",departs[2],false,'2','1',100000),
                new Employee(11111,"홍미동",departs[4],true,'3','1',150000),
                new Employee(11111,"홍수동",departs[5],false,'3','5',250000),
                new Employee(11111,"홍나동",departs[5],true,'1','3',200000),
        };
        Company company = new Company(employees);
        company.display();
    }
}