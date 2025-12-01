// 函数: _Z14SetLocalPlayerj
// 地址: 0x18c32c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = 0
uint32_t r0 = *s_pWorldData
*s_InterfaceContext = 0
*(s_InterfaceContext + 4) = 0
*(s_InterfaceContext + 8) = 0
*(s_InterfaceContext + 0xc) = 0

if (*(r0 + 0x14) != arg1)
    r1 = 1
    
    if (*(r0 + 0x44) != arg1)
        r1 = 2
        
        if (*(r0 + 0x74) != arg1)
            r1 = 3
            
            if (*(r0 + 0xa4) != arg1)
                return r0

*(s_InterfaceContext + 0x10) = r1
void* r0_1 = r1.w * 0x34 + r0
*s_InterfaceContext = *(r0_1 + 0x124)
*(s_InterfaceContext + 4) = *(r0_1 + 0x130)
uint32_t r0_2 = *(r0_1 + 0x134)
*(s_InterfaceContext + 8) = r0_2
GameOptionManager::SetLocalPlayerIndex(r0_2)
int32_t r0_4 = ascension::CWorld::GetPlayerByIndex(*s_InterfaceContext)
*(s_InterfaceContext + 0xc) = r0_4
return r0_4
