package com.logger.demo;

import java.util.Arrays;

import org.slf4j.Marker;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.AbstractMatcherFilter;
import ch.qos.logback.core.spi.FilterReply;



public class MarkerFilter extends AbstractMatcherFilter<ILoggingEvent> {

    Marker markerToMatch;

    /*
     * (non-Javadoc)
     *
     * @see ch.qos.logback.core.filter.Filter#decide(java.lang.Object)
     */
    @Override
    public FilterReply decide(ILoggingEvent event) {
        if (!isStarted()) {
            return FilterReply.NEUTRAL;
        }
        Marker marker = event.getMarker();
        System.out.println(marker);

        if (marker == null) {
            return onMismatch;
        }

        if (markerToMatch.contains(marker)) {
            System.out.println(marker.getName());
            return onMatch;
        } else {
            return onMismatch;
        }
    }



    public void setMarker(String markerStr) {
        if (markerStr != null) {
            for(MyMarker m : MyMarker.values()){
                if(m.getName().equals(markerStr)){
                    this.markerToMatch = m;
                    return;
                }
            }
            throw new IllegalArgumentException("illegal marker name! using " + Arrays.toString(MyMarker.values()));
        }
    }


    @Override
    public void start() {
        if (this.markerToMatch != null) {
            super.start();
        }
    }
}