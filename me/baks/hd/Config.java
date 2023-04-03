/*    */ package me.baks.hd;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import org.bukkit.ChatColor;
/*    */ 
/*    */ public class Config {
/*  7 */   static Main plugin = Main.plugin;
/*    */   
/*  9 */   static HashMap<String, String> names = new HashMap<>();
/* 10 */   static int player_chance = plugin.getConfig().getInt("PlayerChance");
/* 11 */   static int mob_chance = plugin.getConfig().getInt("MobChance");
/*    */   
/*    */   static void loadNames() {
/* 14 */     names.clear();
/*    */     
/* 16 */     for (String string : plugin.getConfig().getConfigurationSection("Names").getValues(false).keySet()) {
/* 17 */       String name = coloredMessage("Names." + string);
/* 18 */       name = ChatColor.translateAlternateColorCodes('&', name);
/* 19 */       names.put(string, name);
/*    */     } 
/*    */   }
/*    */   
/*    */   static void loadConfig() {
/* 24 */     player_chance = plugin.getConfig().getInt("PlayerChance");
/* 25 */     mob_chance = plugin.getConfig().getInt("MobChance");
/* 26 */     loadNames();
/*    */   }
/*    */   
/*    */   private static String coloredMessage(String path) {
/* 30 */     return ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString(path));
/*    */   }
/*    */ }


/* Location:              C:\Users\William\Downloads\HeadDrop.jar!\me\baks\hd\Config.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */