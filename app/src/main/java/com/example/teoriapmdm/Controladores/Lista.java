package com.example.teoriapmdm.Controladores;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teoriapmdm.Adapters.RecyclerAdapter;
import com.example.teoriapmdm.Modelos.Jugadores;
import com.example.teoriapmdm.R;

import java.util.ArrayList;
import java.util.List;

public class Lista extends AppCompatActivity {

    RecyclerAdapter recAdapter;
    RecyclerView recView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        recView = (RecyclerView) findViewById(R.id.reciclerView);
        recAdapter = new RecyclerAdapter(getListJugadores());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setAdapter(recAdapter);
        recView.setLayoutManager(layoutManager);

    }
    public List<Jugadores> getListJugadores(){
        ArrayList<Jugadores> list = new ArrayList<Jugadores>();
        list.add(new Jugadores("Cristiano Ronaldo","En 2017, Cristiano Ronaldo ganó su quinto Balón de Oro, consolidándose como uno de los futbolistas más exitosos de la historia. Este premio fue un reconocimiento a su impresionante rendimiento durante ese año, especialmente por sus logros con el Real Madrid y la selección de Portugal. Durante la temporada 2016-2017, Ronaldo desempeñó un papel fundamental en el éxito del Real Madrid, ayudando al equipo a conquistar la Liga de Campeones de la UEFA, donde fue el máximo goleador del torneo. Además, también contribuyó decisivamente a la victoria de su equipo en la Liga Española y en la Supercopa de Europa, entre otros títulos. En particular, su rendimiento en la final de la Liga de Campeones de 2017 fue crucial, marcando dos goles en la victoria 4-1 sobre la Juventus, lo que ayudó al Real Madrid a conseguir su 12° título europeo. También fue destacado por su capacidad para aparecer en los momentos más importantes, demostrando su eficiencia y liderazgo. Ronaldo también brilló con su selección, Portugal, al llevar al equipo a la victoria en la Eurocopa 2016, un logro histórico para el fútbol portugués, aunque el Balón de Oro 2017 se centró más en sus logros a nivel de clubes. Este quinto Balón de Oro en 2017 le permitió igualar el récord de títulos del galardón, reafirmando su estatus como uno de los más grandes de todos los tiempos en el fútbol mundial.",R.drawable.cr7));
        list.add(new Jugadores("Messi","El último Balón de Oro de Lionel Messi, que ganó en 2023, generó algunas controversias entre los aficionados y analistas del fútbol. Aunque Messi sigue siendo uno de los mejores jugadores de la historia, hubo ciertos factores que llevaron a que algunos cuestionaran si realmente merecía ganar este premio. En primer lugar, la temporada 2022-2023 de Messi no fue tan dominante como en ediciones anteriores. Si bien su desempeño en el Mundial de Qatar fue excepcional y fue clave para que Argentina ganara el torneo, muchos opinan que el Balón de Oro debería basarse en el rendimiento de la temporada completa (de agosto a julio), y no solo en el rendimiento en un solo torneo. Algunos argumentan que Messi, aunque jugó muy bien en la Copa del Mundo, no tuvo el mismo impacto en su club, el PSG. En la Ligue 1, aunque logró números decentes, no logró sobresalir como en años anteriores. Además, el PSG no alcanzó las instancias más altas de la Champions League, algo que muchos consideran importante a la hora de otorgar el premio individual más prestigioso. Por otro lado, la competencia era feroz. Jugadores como Erling Haaland, que tuvo una temporada histórica con el Manchester City, anotando goles a una tasa impresionante y liderando al equipo a ganar la Champions League, la Premier League y la FA Cup, también tenían una candidatura muy fuerte. Haaland rompió varios récords y mostró una consistencia sobresaliente durante toda la temporada, mientras que Messi, aunque brillante en el Mundial, no tuvo un impacto tan grande durante el resto del año futbolístico. El hecho de que Messi haya ganado el Balón de Oro principalmente gracias a su rendimiento en el Mundial ha sido uno de los puntos más debatidos. Muchos sostienen que un jugador debería ser evaluado a lo largo de toda una temporada de clubes, no solo por un mes brillante de torneo internacional. Y en este sentido, el argentino no tuvo una temporada de clubes tan sobresaliente como para justificar el premio individual. Además, el contexto de la votación también fue motivo de discusión. El sistema de votación, basado en periodistas y entrenadores, dejó fuera de la conversación a otros jugadores que tuvieron un año increíble, como Kylian Mbappé, quien fue el máximo goleador del Mundial y quien estuvo en una forma excepcional durante todo el año, tanto en el PSG como con Francia. Por todo esto, se puede argumentar que el último Balón de Oro de Messi fue más una premiación por su legado y su influencia en el fútbol, en lugar de una evaluación estricta de su desempeño en la temporada 2022-2023. Si bien no cabe duda de su grandeza histórica, algunos consideran que este Balón de Oro fue más una recompensa simbólica por su carrera, su Mundial, y su influencia en el fútbol mundial, más que una verdadera coronación de su rendimiento durante la temporada",R.drawable.messi));
        list.add(new Jugadores("Benzema","El 17 de octubre de 2022, Karim Benzema fue coronado como el rey del fútbol. Tras una espectacular temporada 2021/22, France Football entregó al capitán del Real Madrid el Balón de Oro 2022. El acto, que se celebró en París, contó con una amplia representación de nuestro club, encabezada por el presidente Florentino Pérez. Benzema superó por este orden a Mané, De Bruyne y Lewandowski en una votación de 180 periodistas internacionales.Tras recoger el premio de manos de Zidane, Benzema declaró: Tener este trofeo es un orgullo, era un sueño de niño. Es un premio individual, pero también colectivo y para mí es el Balón de Oro del pueblo. Gracias a todo el Madrid, a los jugadores porque sin ellos es imposible, a la afición por empujarme siempre para dar el máximo en el campo, y al presidente El francés recibió este reconocimiento después de liderar al Real Madrid en la conquista de la Decimocuarta, la 35ª Liga y la 12º Supercopa de España, en las que además fue el máximo goleador con 15, 27 y 2 tantos respectivamente. Además, su actuación fue también determinante para que su selección ganase la Liga de Naciones. Benzema ya había sido elegido Jugador del Año de la UEFA.",R.drawable.bencema));
        list.add(new Jugadores("Modric","Luka Modrić logró una victoria histórica en 2018 al ser coronado como el mejor jugador del mundo. Ese año, su desempeño tanto con el Real Madrid como con la selección croata fue sobresaliente, lo que lo llevó a recibir el reconocimiento más prestigioso del fútbol. Modrić fue una pieza clave en la conquista de la Champions League por parte del Real Madrid, en una campaña en la que, a pesar de la presencia de grandes estrellas como Cristiano Ronaldo, el centrocampista croata demostró ser el verdadero motor del equipo en el mediocampo. Además, su liderazgo fue fundamental para que Croacia llegara a la final del Mundial de Rusia 2018, un logro histórico para su país. Aunque Croacia no consiguió el campeonato, Modrić brilló con su habilidad, visión y control del balón, lo que le valió el Balón de Oro del Mundial como mejor jugador del torneo. A pesar de las expectativas sobre otros jugadores como Cristiano Ronaldo o Lionel Messi, Modrić demostró que un centrocampista podía dominar el galardón, desafiando la tradición de que el premio generalmente recaía en los goleadores. Su capacidad para influir en el juego, tanto a nivel de club como internacional, lo colocó como el merecedor del premio, marcando un hito en la historia del fútbol y el reconocimiento al talento de los jugadores en posiciones menos mediáticas.",R.drawable.modric));
        list.add(new Jugadores("Zidane","Zinédine Zidane ganó el Balón de Oro en 1998, un año que marcó su carrera y el fútbol mundial de manera significativa. La victoria de Zidane en ese año no solo fue el reconocimiento a su extraordinario talento, sino también un premio simbólico por su influencia en uno de los momentos más importantes de la historia del fútbol: la Copa del Mundo de 1998, celebrada en Francia. Zidane fue una pieza clave para que la selección francesa ganara su primer Mundial, y su actuación en la final contra Brasil fue decisiva. El centrocampista anotó dos goles de cabeza en esa final, ambos de jugadas a balón parado, lo que selló la victoria por 3-0 de Francia sobre Brasil. Esta actuación brillante en el torneo lo catapultó a la cima del fútbol mundial. A nivel de clubes, Zidane también tuvo un impacto tremendo en ese 1998. Aunque jugaba en la Juventus, su nombre ya estaba asociado con los mejores equipos de Europa, y su estilo de juego elegante y su habilidad para controlar el ritmo del partido eran ampliamente reconocidos. Sin embargo, fue su desempeño internacional lo que realmente destacó en ese año, y el Balón de Oro se convirtió en un reconocimiento tanto a sus logros con Francia como a su clase y talento en el campo. La victoria de Zidane en 1998 también rompió una racha de victorias dominadas por los jugadores de ataque, ya que los anteriores ganadores fueron principalmente delanteros como Ronaldo, George Weah o Roberto Baggio. Su triunfo fue un testamento a la importancia de los centrocampistas en el fútbol, algo que ayudó a cimentar la idea de que un gran mediocampista puede ser tan influyente como un goleador. Zidane se convirtió en un referente para los jugadores de su posición y es considerado uno de los más grandes futbolistas de todos los tiempos. En resumen, el Balón de Oro de Zidane en 1998 fue el reconocimiento a una temporada de ensueño, donde destacó tanto a nivel de selecciones como a nivel de clubes, y subrayó su estatus como uno de los futbolistas más completos y talentosos de su generación.",R.drawable.zidane));
        list.add(new Jugadores("Kaka","Kaká ganó el Balón de Oro en 2007, un reconocimiento que marcó un hito en su carrera y en el fútbol mundial. Su victoria ese año sorprendió a algunos, ya que en una época dominada por los grandes nombres como Cristiano Ronaldo y Lionel Messi, Kaká logró destacarse de manera única. En 2007, el brasileño tuvo una temporada espectacular, siendo la pieza clave del Milan en su conquista de la Liga de Campeones de la UEFA, donde jugó un papel decisivo en todo el torneo. En particular, en las semifinales contra el Manchester United y en la final contra el Liverpool, Kaká mostró su nivel más alto, destacándose por su visión, técnica y habilidad para definir en momentos cruciales. Lo más impresionante de Kaká en 2007 fue su capacidad para ser un jugador completo, combinando su genialidad técnica con su destreza para marcar goles. Durante esa temporada, el brasileño anotó 10 goles en la Champions League, liderando al Milan hacia el título europeo. A nivel nacional, aunque Brasil no consiguió el máximo trofeo en la Copa América de 2007, la temporada de Kaká en Europa lo consolidó como uno de los mejores jugadores del mundo. Además, su capacidad para desequilibrar con su velocidad, regate y visión de juego le otorgó una ventaja sobre otros candidatos, especialmente en comparación con los goleadores puros de la época. Su Balón de Oro no solo fue un premio por su temporada sobresaliente con el Milan, sino también un reconocimiento a su estilo de juego elegante y su contribución a la evolución del centrocampista ofensivo. En un contexto donde los jugadores más mediáticos eran frecuentemente los goleadores, Kaká logró demostrar que un mediocampista creativo podía igualmente tener el protagonismo necesario para ser considerado el mejor jugador del mundo. La victoria de Kaká en 2007 fue un reconocimiento a su talento único, su capacidad de desequilibrio y su contribución al éxito del Milan en la Champions League, así como una afirmación de que, en ciertos momentos, la magia de un mediocampista completo puede eclipsar a otros jugadores más enfocados en el gol. A día de hoy, el Balón de Oro de Kaká sigue siendo uno de los más recordados por los aficionados del fútbol, un premio que celebró no solo su habilidad individual, sino también el fútbol de equipo y el papel vital de los jugadores creativos.",R.drawable.kaka));
        return list;
    }
}