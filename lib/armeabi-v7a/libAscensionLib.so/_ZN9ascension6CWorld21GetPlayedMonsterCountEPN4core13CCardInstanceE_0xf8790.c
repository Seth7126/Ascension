// 函数: _ZN9ascension6CWorld21GetPlayedMonsterCountEPN4core13CCardInstanceE
// 地址: 0xf8790
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r2 = *(arg1 + 0xb80)
int32_t r12 = *(arg1 + 0xb84)
int32_t result = 0

if (r2 == r12)
    return 0

do
    if ((zx.d(r2[1].b) & 1) == 0)
        void* r3_2 = *r2
        int32_t entry_r1
        
        if (r3_2 != 0 && r3_2 != entry_r1 && *(*(r3_2 + 0xc) + 0x88) == 3)
            result += 1
    
    r2 = &r2[2]
while (r12 != r2)

return result
