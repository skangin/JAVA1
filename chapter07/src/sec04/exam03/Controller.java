package sec04.exam03;

public class Controller {
    public MemberService service;
	//var MemberService service = new AService()
    public void setService (MemberService service) {
        this.service = service;
    }
}


Controller controller = new Controller();
Controller.setService( _______________ );


1) new Service()          //(X)
2) new MemberService()    //(O)
3) new AService()         //(O)
4) new BService()         //(O)
5) new BoardService()     //(X)
6) new DService()         //(X)
