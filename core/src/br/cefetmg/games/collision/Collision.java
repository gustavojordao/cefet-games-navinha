package br.cefetmg.games.collision;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Utilitário para verificação de colisão.
 *
 * @author fegemo <coutinho@decom.cefetmg.br>
 */
public class Collision {

    /**
     * Verifica se dois círculos em 2D estão colidindo.
     * @param c1 círculo 1
     * @param c2 círculo 2
     * @return true se há colisão ou false, do contrário.
     */
    public static final boolean circlesOverlap(Circle c1, Circle c2) {

        Vector2 c1_p = new Vector2(c1.x, c1.y);
        Vector2 c2_p = new Vector2(c2.x, c2.y);
        
        Vector2 c1_c2_v = c2_p.sub(c1_p);
        
        float distance = c1_c2_v.len2();
        
        return distance < (c1.radius+c2.radius)*(c1.radius+c2.radius);

    }

    /**
     * Verifica se dois retângulos em 2D estão colidindo.
     * Esta função pode verificar se o eixo X dos dois objetos está colidindo
     * e então se o mesmo ocorre com o eixo Y.
     * @param r1 retângulo 1
     * @param r2 retângulo 2
     * @return true se há colisão ou false, do contrário.
     */
    public static final boolean rectsOverlap(Rectangle r1, Rectangle r2) {
        
        boolean overlap_x = false;
        boolean overlap_y = false;
        
        float max_x1 = r1.x + r1.width;
        float min_x1 = r1.x;
        float max_x2 = r2.x + r2.width;
        float min_x2 = r2.x;

        float max_y1 = r1.y + r1.height;
        float min_y1 = r1.y;
        float max_y2 = r2.y + r2.height;
        float min_y2 = r2.y;

        
        overlap_x = (max_x1 > min_x2 && min_x1 < max_x2) || (max_x2 > min_x1 && min_x2 < max_x1);
        overlap_y = (max_y1 > min_y2 && min_y1 < max_y2) || (max_y2 > min_y1 && min_y2 < max_y1);

        return overlap_x && overlap_y;
    }
    
    public static final boolean rectCircleOverlap(Rectangle r, Circle c){
        
       /* boolean overlap_x = false;
        boolean overlap_y = false;
        
        Vector2 r_central_p = new Vector2(r.x+r.width/2, r.y+r.height/2);
        Vector2 c_central_p = new Vector2(c.x, c.y);
        
        Vector2 r_c = r_central_p.sub(c_central_p); 
        
        r_c.sub(r_c.)
        
        //overlap_x = r_c.x + r_c.width/2 < ;
        */
        return false;
    }
}
