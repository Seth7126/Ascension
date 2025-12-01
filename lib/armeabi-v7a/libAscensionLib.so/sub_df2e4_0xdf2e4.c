// 函数: sub_df2e4
// 地址: 0xdf2e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg2 != 0 && (zx.d(*(arg2 + 6)) & 0x20) == 0)
    int32_t* result = sub_dc6c8(arg2, 5, *(*(arg1 + 0xc) + 0xcc))
    
    if (result != 0)
        if (arg2 == arg3)
            return result
        
        if (arg3 != 0 && (zx.d(*(arg3 + 6)) & 0x20) == 0)
            int32_t* r0_6 = sub_dc6c8(arg3, 5, *(*(arg1 + 0xc) + 0xcc))
            
            if (r0_6 != 0 && result[2] == r0_6[2])
                if (sub_df0d4(nullptr, result, r0_6) == 0)
                    return nullptr
                
                return result

return nullptr
