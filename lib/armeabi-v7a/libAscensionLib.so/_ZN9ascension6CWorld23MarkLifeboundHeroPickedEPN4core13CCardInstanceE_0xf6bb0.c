// 函数: _ZN9ascension6CWorld23MarkLifeboundHeroPickedEPN4core13CCardInstanceE
// 地址: 0xf6bb0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *(arg1 + 0xac8)
int32_t r3 = *(arg1 + 0xacc)

if (r3 == r1)
    return 

int32_t i = 0

do
    void* entry_r1
    
    if (zx.d(*(entry_r1 + 8)) == zx.d(*(*(r1 + (i << 3)) + 8)))
        *(r1 + (i << 3) + 4) = 1
        arg1 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[1].align:1)
        
        if (arg1 == 0)
            break
        
        *(arg1 + 0xc) = zx.d(*(entry_r1 + 8))
        return 
    
    i += 1
while (i u< (r3 - r1) s>> 3)
