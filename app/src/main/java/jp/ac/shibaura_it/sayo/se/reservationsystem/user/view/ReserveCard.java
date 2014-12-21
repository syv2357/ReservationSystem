package jp.ac.shibaura_it.sayo.se.reservationsystem.user.view;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import butterknife.InjectView;
import it.gmariotti.cardslib.library.internal.Card;
import jp.ac.shibaura_it.sayo.se.reservationsystem.user.model.Reserve;
import jp.ac.shibaura_it.sayo.se.reservationsystem.user.R;

/**
 * Created by Shuya on 14/12/21.
 */
public class ReserveCard extends Card {
    private Reserve reserve;
    private TextView reserveCardDay;
    private TextView reserveCardPurpose;
    private TextView reserveCardRoom;
    private TextView reserveCardTime;

    public ReserveCard(Context context) {
        this(context, R.layout.reserve_card_layout);
    }

    public ReserveCard(Context context, Reserve reserve) {
        this(context, R.layout.reserve_card_layout);
        this.reserve = reserve;
    }

    public ReserveCard(Context context, int innerLayout) {
        super(context, innerLayout);
        init();
    }

    private void init() {
        // Set a OnClickListener listener
        setOnClickListener(new OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                Toast.makeText(getContext(), "Click Listener card =", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {
        this.reserveCardPurpose = (TextView)parent.findViewById(R.id.reserveCardPurpose);
        this.reserveCardDay = (TextView)parent.findViewById(R.id.reserveCardDay);
        this.reserveCardTime = (TextView)parent.findViewById(R.id.reserveCardTime);
        this.reserveCardRoom = (TextView)parent.findViewById(R.id.reserveCardRoom);

        this.reserveCardPurpose.setText(this.reserve.getPurpose());
        //this.reserveCardRoom.setText(this.reserve.getRoom());
        //this.reserveCardDay.setText(this.reserve.getStartTime().toString());
        //this.reserveCardDay.setText(this.reserve.getStartTime().toString());
    }

}
