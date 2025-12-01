// 函数: _ZN4core10CWorldBase15SetGameCompleteEb
// 地址: 0xb7d40
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3_3 = *(arg1 + 0xa18)

if (r3_3 != 0)
    int32_t* r2_1 = *(arg1 + 0xa20)
    
    if (&r2_1[4] u<= r3_3 + *(arg1 + 0xa1c))
        *r2_1 = *(arg1 + 0xa24)
        r2_1[1] = 0
        r2_1[2] = &(*__elf_header.ident.signature)[1]
        *(arg1 + 0xa20) = &r2_1[4]
        *(arg1 + 0xa24) = r2_1
        
        if (r2_1 != 0)
            r2_1[3] = zx.d(*(arg1 + 0x11))

char entry_r1
*(arg1 + 0x11) = entry_r1
