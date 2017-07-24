package me.xueyao.level2_02;
/**
 * @author Yao Xue
 * @date Jul 23, 2017 9:09:44 PM
 */
public class Son extends Father{
   /* @Override
    public void eat() throws TonguePainException {
       throw new TonguePainException();
    }*/
    
    /*@Override
    public void eat() throws Exception {
        // TODO Auto-generated method stub
        throw new Exception();
    }*/
    
   /* @Override
    public void eat() throws ToothPainException {
        // TODO Auto-generated method stub
        throw new ToothPainException();
    }*/
    
    /*@Override
    public void eat() throws BigToothPainException {
        throw new BigToothPainException();
    }*/
    /*
    @Override
    public void eat() throws ToothPainException {
        throw new BigToothPainException();
    }*/
    
    /*@Override
    public void drink() throws ToothPainException{
        // TODO Auto-generated method stub
        super.drink();
    }*/
    
    /*@Override
    public void drink() throws TonguePainException{
        // TODO Auto-generated method stub
        super.drink();
    }
    */
    /*
    @Override
    public void drink() throws BigToothPainException{
        // TODO Auto-generated method stub
        super.drink();
    }*/
    
    @Override
    public void drink() {
       
        try {
            System.out.println("喝到了100度的水");
            throw new TonguePainException();
        } catch (TonguePainException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

