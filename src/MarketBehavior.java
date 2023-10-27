package PACKAGE_NAME;public interface MarketBehavior {
  
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actorList);
    void update();
}
