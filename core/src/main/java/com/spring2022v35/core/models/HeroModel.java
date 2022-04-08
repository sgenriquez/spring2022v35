package com.spring2022v35.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeroModel {

    @ValueMapValue
    private String subtitle;

    @ValueMapValue
    private String heading;

    @ValueMapValue
    private String text;

    @ValueMapValue
    private String image;


    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage() {
        /*return "/apps/spring2022v35/clientlibs/clientlib-site/resources/images/" + image + ".png";*/
        return image + ".png";
    }

    public void setImage(String image) {
        this.image = image;
    }
}