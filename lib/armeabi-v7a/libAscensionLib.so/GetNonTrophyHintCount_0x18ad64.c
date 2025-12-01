// 函数: GetNonTrophyHintCount
// 地址: 0x18ad64
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (GameOptionManager::IsSelectableHint((*(s_InterfaceContext + 8)).w) != 0)
    *(s_InterfaceContext + 8)
    int32_t r0_3 = GameOptionManager::GetOptionCount()
    void* r6_1 = *(s_InterfaceContext + 0xc)
    int32_t r4_1 = r0_3
    int32_t* r0_4 = *(r6_1 + 0x60)
    void* r5_1 = *(r6_1 + 0x64) - r0_4
    
    if (r5_1 s>= 1)
        if (GameOptionManager::IsSelectableInstanceID((*(s_InterfaceContext + 8)).w, 
                zx.d(*(*r0_4 + 8))) != 0)
            r4_1 -= 1
        
        if (r5_1 s>= 5)
            int32_t i = 1
            
            do
                bool cond:0_1 = GameOptionManager::IsSelectableInstanceID(
                    (*(s_InterfaceContext + 8)).w, zx.d(*(*(*(r6_1 + 0x60) + (i << 2)) + 8))) != 0
                i += 1
                
                if (cond:0_1)
                    r4_1 -= 1
            while (i s< r5_1 s>> 2)
    
    result = 0
    
    if (r4_1 s> 1)
        return 1

return result
