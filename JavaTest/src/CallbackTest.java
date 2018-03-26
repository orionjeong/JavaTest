public class CallbackTest {

    interface Resister{
        public void play();
    }
    class Callee{
        private Resister resister;
        private boolean status;

//        등록하는 부분

        public void setResister(Resister resister) {
            this.resister = resister;
        }

//        조건이 맞을 때 실행하는 부분
        private void callBackMethodSetting(){
            if(status && resister != null){
                resister.play();
            }
        }

    }
    class Caller{
        private Callee callee;
//        callee를 호출하면서 등록하는 부분
        public Callee setCallee(Resister r){
            callee = new Callee();
            callee.setResister(r);
            return callee;
        }


    }
    public static void main(String args[]){
        CallbackTest callbackTest = new CallbackTest();
        Caller caller = callbackTest.new Caller();
        caller.setCallee(new Resister() {
            @Override
            public void play() {
                System.out.println("피호출자가 호출자를 호출하였습니다.");
            }
        });



    }
}
