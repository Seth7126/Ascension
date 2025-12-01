// 函数: GetGamePlayerLogCount
// 地址: 0x1899c4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0
uint32_t r0 = *s_pWorldData

if (r0 != 0)
    int32_t r2_1 = *(r0 + 0xd4)
    
    if (r2_1 s>= 1)
        int32_t* r3_1 = r0 + 0x14
        int32_t r6_1 = 0
        
        while (*r3_1 != arg1)
            r6_1 += 1
            r3_1 = &r3_1[0xc]
            
            if (r6_1 s>= r2_1)
                return 0
        
        result = 0
        int32_t r0_3 = *(r0 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
        
        if (r0_3 != 0)
            int32_t r0_4 = ascension::CWorld::GetPlayerByIndex(r0_3)
            
            if (r0_4 != 0 && ascension::CPlayer::GetTurnLog(r0_4) != 0)
                void* r0_7 = ascension::CPlayer::GetTurnLog(r0_4)
                return (*(r0_7 + 0x14) - *(r0_7 + 0x10)) s>> 3

return result
