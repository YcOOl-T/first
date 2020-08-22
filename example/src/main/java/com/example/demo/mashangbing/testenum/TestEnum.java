package com.example.demo.mashangbing.testenum;

/**
 * Author:ty
 * 2020/6/26
 */
public class TestEnum {
    public enum Mycolor{
        red,blue,green
    }

    public enum Myseason{
        spring,summer,autumn,winter;

        String position="test";

        Myseason getMyseason(){
            if(position.equals("test")){
                return spring;
            }
            return null;
        };
    }

    public enum Gender{
        man("男人"),women("women");

        private final String value;
        Gender(String value) {
           this.value=value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum Week{
        Monday{public String getName(){return "星期一";}
        },
        Tuesday{public String getName(){return "星期二";}
        },
        Wednesday{public String getName(){return "星期三";}
        },
        Thursday{public String getName(){return "星期四";}
        },
        Friday{public String getName(){return "星期五";}
        },
        Saturday{public String getName(){return "星期六";}
        },
        Sunday{public String getName(){return "星期天";}
        };



        public abstract String getName();
    }

    public enum Green{
        green
    }

    public enum example{
        例1,例2
    }
    public static void main(String[] args) {
        Mycolor mycolor=Mycolor.red;
        switch (mycolor) {
            case blue:
                System.out.println("是蓝色");
                break;
            default:
                System.out.println("其他色");

        }

        Myseason myseason=Myseason.winter;
        switch (myseason.getMyseason()) {
            case spring:
                System.out.println("spring");
                break;
            case summer:
                System.out.println("summer");
                break;
            case autumn:
                System.out.println("autumn");
                break;
            case winter:
                System.out.println("winter");
                break;
        }

        for (Gender gender:Gender.values()
             ) {
            System.out.print(gender.getValue()+" ");
        }
        System.out.println();

        for (Week week:Week.values()
             ) {
            System.out.print(week.getName()+" ");
        }

        






    }
}
