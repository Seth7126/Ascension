// 函数: UpdateGame
// 地址: 0x1977a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r2 = *s_pWorldData

if (r2 == 0)
    return 0

data_1f5894 = arg1
data_1f5898 = arg1
data_1f589c = arg2
data_1f5890 = 0
data_1f4e48 = 0

if (*(r2 + 0xf8) != 3)
    UpdateOfflineGame()
else
    UpdateOnlineGame()

int32_t* r0_2 = data_1f5894

if (r0_2 != 0 && &r0_2[1] u< data_1f5898 + data_1f589c)
    *r0_2 = 0
    data_1f5894 = &r0_2[1]

data_1f5898 = 0
data_1f5894 = 0
data_1f589c = 0
int32_t result = data_1f5890
data_1f5890 = 0
data_1f4e48 = 0
return result
