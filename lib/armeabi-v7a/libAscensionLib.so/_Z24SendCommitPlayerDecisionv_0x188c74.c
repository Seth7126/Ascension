// 函数: _Z24SendCommitPlayerDecisionv
// 地址: 0x188c74
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

CommitTemporaryMoveBuffer()
data_1f4e48 = 1
int32_t* result = data_1f5894

if (result != 0)
    if (&result[3] u>= data_1f5898 + data_1f589c)
        return result
    
    result[1] = 0x24
    *result = 0xc
    data_1f5894 = &result[3]
    uint32_t r3_1 = *s_pWorldData
    data_1f5890 += 1
    result[2] = *(r3_1 + 0x1fc)

return result
