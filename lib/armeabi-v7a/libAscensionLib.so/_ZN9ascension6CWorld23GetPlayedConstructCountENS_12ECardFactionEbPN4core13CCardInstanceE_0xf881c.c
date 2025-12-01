// 函数: _ZN9ascension6CWorld23GetPlayedConstructCountENS_12ECardFactionEbPN4core13CCardInstanceE
// 地址: 0xf881c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r7 = arg1
void* r0 = *(arg1 + 0xb8c)
int32_t* i = *(r0 + 0xc)

if (i == *(r0 + 0x10))
    return 0

int32_t result = 0

do
    void* r2 = *i
    int32_t entry_r3
    
    if (r2 != 0 && r2 != entry_r3)
        int32_t r0_3
        
        if (arg3 == 0)
            r0_3 = ascension::CCard::IsCardFaction(*(r2 + 0xc))
        else
            r0_3 = ascension::CWorld::QueryCardFaction(r7, *(r7 + 0xb20), r2)
        
        result += r0_3
    
    i = &i[1]
while (i != *(*(r7 + 0xb8c) + 0x10))

return result
