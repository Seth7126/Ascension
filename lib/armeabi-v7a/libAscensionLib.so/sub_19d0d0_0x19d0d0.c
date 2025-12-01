// 函数: sub_19d0d0
// 地址: 0x19d0d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* var_20 = &data_1f5ae0
pthread_mutex_lock(&data_1f5ae0)
int32_t* r0_1 = data_1f5ae4

if (r0_1 == 0)
    r0_1 = &data_1f58e0
    data_1f5ae4 = &data_1f58e0
    data_1f58e0 = 0x800080

int32_t* r3 = nullptr
void* result

while (true)
    result = nullptr
    
    if (r0_1 == 0)
        break
    
    if (r0_1 == &data_1f5ae0)
        break
    
    uint32_t r5_2 = zx.d(*(r0_1 + 2))
    
    if (1 + ((arg1 + 3) u>> 2) u< r5_2)
        int16_t r2_1 = r5_2.w - (1 + ((arg1 + 3) u>> 2)).w
        *(r0_1 + 2) = r2_1
        uint32_t r2_2 = zx.d(r2_1)
        r0_1[r2_2].w = 0
        void* r0_2 = &r0_1[r2_2]
        result = r0_2 + 4
        *(r0_2 + 2) = (1 + ((arg1 + 3) u>> 2)).w
        break
    
    if (1 + ((arg1 + 3) u>> 2) == r5_2)
        uint32_t r1_2 = zx.d(*r0_1)
        
        if (r3 != 0)
            *r3 = r1_2.w
        else
            data_1f5ae4 = &(&data_1f58e0)[r1_2]
        
        *r0_1 = 0
        result = &r0_1[1]
        break
    
    r3 = r0_1
    r0_1 = &(&data_1f58e0)[zx.d(*r0_1)]

sub_19d2c4(&var_20)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
