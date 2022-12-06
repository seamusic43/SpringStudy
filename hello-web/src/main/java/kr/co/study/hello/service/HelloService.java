package kr.co.study.hello.service;

import kr.co.study.hello.dao.AnotherDAO;
import kr.co.study.hello.dao.HelloDAO;

public class HelloService {
    private HelloDAO dao;
    private AnotherDAO anotherDAO;

    /*
    // 생성자를 이용한 DI 방법
    public HelloService(HelloDAO dao) {
        this.dao = dao;
    }
     */
    public void setAnotherDAO(AnotherDAO anotherDAO) {
        this.anotherDAO = anotherDAO;
    }


        // setter 를 이용한 DI 방법
        public void setDao(HelloDAO dao) {
            this.dao = dao;
        }
    public int calcTwoNumberAndSquare(int a, int b) {
        int result = dao.addTwoNumber(a,b);
        return anotherDAO.square(result);

    }

    public int calcTwoNumber(int a, int b) {
        /*
        // 참조된 객체를 직접 생성하는 방법 - 비효율적
        dao = new HelloDAO();
        return dao.addTwoNumber(a,b);
         */

        return dao.addTwoNumber(a,b);

    }
}
