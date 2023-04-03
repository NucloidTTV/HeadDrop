/*    */ package me.baks.hd;
/*    */ 
/*    */ import org.bukkit.plugin.Plugin;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ public class Main extends JavaPlugin {
/*    */   static Main plugin;
/*    */   
/*    */   public void onEnable() {
/* 10 */     plugin = this;
/* 11 */     saveDefaultConfig();
/* 12 */     Config.loadNames();
/* 13 */     getServer().getPluginManager().registerEvents(new PluginListener(), (Plugin)this);
/* 14 */     getCommand("headdrop").setExecutor(new Commands());
/*    */   }
/*    */ }


/* Location:              C:\Users\William\Downloads\HeadDrop.jar!\me\baks\hd\Main.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */