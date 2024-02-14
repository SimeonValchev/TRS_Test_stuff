import java.util.Arrays;

public class trsProject {

    public static void main(String[] args) {

        //EXAMPLE 8
        /*
        //g
        Term g = new Term('g');
        //a
        Term a = new Term('a');
        //f(a)
        Term f_a = new Term('f',1,new Term[]{a});
        //b
        Term b = new Term('b');

        //RULES
        Rule alpha1 = new Rule(g,f_a);
        Rule alpha2 = new Rule(a,b);
        Rule alpha3 = new Rule(f_a,f_a);

        //TRS EX_8
        TRS example_8 = new TRS(new Rule[]{alpha1,alpha2,alpha3}, null);
        */

        //EXAMPLE 7
        /*
        //VARS
        Term x = new Term('X');
        Term y = new Term('Y');

        //h(x)
        Term h_x = new Term('h',1, new Term[]{x});
        //s(y)
        Term s_y = new Term('s',1, new Term[]{y});
        Term s_x = new Term('s',1, new Term[]{x});
        //f(x,s(y))
        Term f_x_sy = new Term('f',2, new Term[]{x,s_y});
        Term f_x_y = new Term('f',2, new Term[]{x,y});
        //g_x
        Term g_x = new Term('g',1,new Term[]{x});
        //g(s(x))
        Term g_sx = new Term('g',1, new Term[]{s_x});
        //f(g(x),x)
        Term f_gx_x = new Term('f',2, new Term[]{g_x,x});
        //c(x, f(x,y))
        Term c_x_fxy = new Term('c',2, new Term[]{x,f_x_y});


        //RULES
        Rule alpha1 = new Rule(h_x,f_gx_x);
        Rule alpha2 = new Rule(f_x_sy,c_x_fxy);
        Rule alpha3 = new Rule(g_sx,g_x);

        //TRS EX_7
        TRS example_7 = new TRS(new Rule[]{alpha1,alpha2,alpha3}, new char[]{'X','Y'});
        */

        //EXAMPLE 9
        /*
        //VARS
        Term x = new Term('X');
        Term y = new Term('Y');

        //h(x)
        Term h_x = new Term('h',1, new Term[]{x});
        //s(y)
        Term s_y = new Term('s',1, new Term[]{y});
        Term s_x = new Term('s',1, new Term[]{x});
        //f(x,s(y))
        Term f_x_sy = new Term('f',2, new Term[]{x,s_y});
        Term f_x_y = new Term('f',2, new Term[]{x,y});
        //g_x
        Term g_x = new Term('g',1,new Term[]{x});
        //g(s(x))
        Term g_sx = new Term('g',1, new Term[]{s_x});
        //f(g(x),x)
        Term f_gx_x = new Term('f',2, new Term[]{g_x,x});
        //f( f(g(x),x), x)
        Term f_f_gx_x_x = new Term('f',2, new Term[]{f_gx_x,x});
        //c(x, f(x,y))
        Term c_x_fxy = new Term('c',2, new Term[]{x,f_x_y});


        //RULES
        Rule alpha1 = new Rule(h_x,f_f_gx_x_x);
        Rule alpha2 = new Rule(f_x_sy,c_x_fxy);
        Rule alpha3 = new Rule(g_sx,g_x);

        //TRS EX_9
        TRS example_9 = new TRS(new Rule[]{alpha1,alpha2,alpha3}, new char[]{'X','Y'});

         */

        //EXAMPLE 10
        //*
        //VARS
        Term x = new Term('X');
        Term y = new Term('Y');
        Term z = new Term('Z');

        Term zero = new Term('0');

        //h(x)
        Term h_x = new Term('h',1, new Term[]{x});
        //s(x)
        Term s_x = new Term('s',1, new Term[]{x});
        Term s_z = new Term('s',1, new Term[]{z});
        //f(x, 0, x)
        Term f_x_0_x = new Term('f',3, new Term[]{x, zero, x});
        //f(x, y, s(z))
        Term f_x_y_sz = new Term('f',3, new Term[]{x,y,s_z});
        //g_x_y
        Term g_x_y = new Term('g',2,new Term[]{x, y});
        //dbl(x)
        Term dbl_x = new Term('w',1, new Term[]{x});
        //dbl( g(x,y))
        Term dbl_g_xy = new Term('w',1, new Term[]{g_x_y});
        //d(x,x)
        Term d_x_x = new Term('d',2, new Term[]{x,x});
        //lin(x)
        Term lin_x = new Term('l',1, new Term[]{x});
        //lin(s(x))
        Term lin_s_x = new Term('l',1, new Term[]{s_x});
        //f(x, dbl( g(x,y)), z)
        Term f_x_dbl_g_xy_z = new Term('f',3,new Term[]{x, dbl_g_xy, z});

        //RULES
        Rule alpha1 = new Rule(h_x,f_x_0_x);
        Rule alpha2 = new Rule(f_x_y_sz, f_x_dbl_g_xy_z);
        Rule alpha3 = new Rule(dbl_x,d_x_x);
        Rule alpha4 = new Rule(g_x_y,lin_x);
        Rule alpha5 = new Rule(lin_s_x,lin_x);

        //TRS EX_10
        TRS example_10 = new TRS(new Rule[]{alpha1,alpha2,alpha3,alpha4,alpha5}, new char[]{'X','Y','Z'});
        //*/

        //EXECUTABLE
        System.out.println("------ ENC -----");
        for (Location lambda : example_10.ENC_R()) {
            if(lambda == null){
                continue;
            }
            System.out.println(lambda.write());
        }
        System.out.println("------ ALEPH -----");
        for (Nest lambda : example_10.theALEPH()) {
            if(lambda == null){
                continue;
            }
            System.out.println(lambda.write());
        }
        System.out.println("------ NST -----");
        for (Nest lambda : example_10.NST_R()) {
            if(lambda == null){
                continue;
            }
            System.out.println(lambda.write());
        }
        System.out.println("------ INF -----");
        for (Location lambda : example_10.INF_R()) {
            if(lambda == null){
                continue;
            }
            System.out.println(lambda.write());
        }


        /*
        //TERM TESTS
        System.out.println(t3.write());
        System.out.println(t4.write());
        System.out.println(t4.posNumber(true));
        System.out.println(Arrays.toString(t4.positions(true)));

        t4.replaceAtWith("1",t3);
        System.out.println(t4.write());
        System.out.println(Arrays.toString(t4.positions(true)));

        t4.replaceAtWith("1.1",t3);
        System.out.println(t4.write());
        System.out.println(Arrays.toString(t4.positions(true)));

        System.out.println(t4.subTermAt("1.1.2").write());
        */

        /*
        TRS trs1 = new TRS(new Rule[]{r1}, new char[]{'X', 'Y'});
        System.out.println(t3.write() + " : " + t33.write());
        System.out.println(trs1.MGU(t3,t33));

        System.out.println(trs1.CAP(t333).write());
        */

    }

    public static boolean piLEQtau(String pi, String tau){
        return pi.length() <= tau.length() && pi.equals(tau.substring(0,pi.length()));
    }

    public static boolean lambaLEQkappa(Location lambda, Location kappa){
        return lambda.alpha.left.equals(kappa.alpha.left) && lambda.left == kappa.left && piLEQtau(lambda.position, kappa.position);
    }
}




