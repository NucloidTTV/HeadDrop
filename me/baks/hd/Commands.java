/*    */ package me.baks.hd;
/*    */ 
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ 
/*    */ public class Commands implements CommandExecutor {
/*  8 */   static Main plugin = Main.plugin;
/*    */   
/* 10 */   static String cmd_reload = "§3/headdrop reload §f- §7Reload config";
/*    */ 
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/* 14 */     if (sender.hasPermission("headdrop.reload")) {
/* 15 */       if (args.length == 0) {
/* 16 */         sender.sendMessage(cmd_reload);
/*    */       }
/* 18 */       else if (args[0].equalsIgnoreCase("reload")) {
/* 19 */         plugin.reloadConfig();
/* 20 */         Config.loadConfig();
/* 21 */         sender.sendMessage("Done!");
/*    */       } else {
/* 23 */         sender.sendMessage(cmd_reload);
/*    */       } 
/*    */     } else {
/*    */       
/* 27 */       sender.sendMessage("You don't have permission");
/*    */     } 
/*    */     
/* 30 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\William\Downloads\HeadDrop.jar!\me\baks\hd\Commands.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */