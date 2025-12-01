// 函数: _ZN9ascension6CWorld19AddCardToPortalDeckEPN4core13CCardInstanceE
// 地址: 0xf4568
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardStack::AddCard(*(arg1 + 0xa3c))
int32_t result = *(arg1 + 0x30)

if (result u>= 5)
    void* entry_r1
    void* r6_1 = *(entry_r1 + 0xc)
    core::CInstance** r7_1 = *(r6_1 + 0x130)
    
    while (true)
        result = *(r6_1 + 0x134)
        
        if (r7_1 == result)
            break
        
        core::CInstance* r1 = *r7_1
        r7_1 = &r7_1[1]
        ascension::CWorld::AddGlobalActiveEffect(arg1, r1)

return result
