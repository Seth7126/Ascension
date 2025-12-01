// 函数: _ZN14ascensionrules29CanDefeatMonsterWithLessPowerEPN9ascension7CPlayerEib
// 地址: 0x1596b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5 = *(arg1 + 4)
void* r0_1 = ascension::CWorld::GetCenterRowCard(r5)

if (r0_1 == 0)
label_159708:
    void* r0_5 = ascension::CWorld::GetCenterRowCard(r5)
    
    if (r0_5 == 0)
    label_159740:
        void* r0_9 = ascension::CWorld::GetCenterRowCard(r5)
        
        if (r0_9 == 0)
        label_159778:
            void* r0_13 = ascension::CWorld::GetCenterRowCard(r5)
            
            if (r0_13 == 0)
            label_1597b0:
                void* r0_17 = ascension::CWorld::GetCenterRowCard(r5)
                
                if (r0_17 == 0)
                label_1597e8:
                    void* r0_21 = ascension::CWorld::GetCenterRowCard(r5)
                    
                    if (r0_21 == 0)
                    label_159820:
                        void* r0_25 = ascension::CWorld::GetCenterRowCard(r5)
                        
                        if (r0_25 == 0)
                            return 0
                        
                        void* r1_19 = *(r0_25 + 0xc)
                        
                        if (*(r1_19 + 0x88) != 3)
                            return 0
                        
                        bool cond:13_1 = arg2 s> 1
                        
                        if (arg2 s>= 1)
                            cond:13_1 = *(r1_19 + 0xa0) s> arg2
                        
                        if (cond:13_1)
                            return 0
                    else
                        void* r1_16 = *(r0_21 + 0xc)
                        
                        if (*(r1_16 + 0x88) != 3)
                            goto label_159820
                        
                        bool cond:11_1 = arg2 s<= 1
                        
                        if (arg2 s>= 1)
                            cond:11_1 = *(r1_16 + 0xa0) s<= arg2
                        
                        if (not(cond:11_1))
                            goto label_159820
                else
                    void* r1_13 = *(r0_17 + 0xc)
                    
                    if (*(r1_13 + 0x88) != 3)
                        goto label_1597e8
                    
                    bool cond:9_1 = arg2 s<= 1
                    
                    if (arg2 s>= 1)
                        cond:9_1 = *(r1_13 + 0xa0) s<= arg2
                    
                    if (not(cond:9_1))
                        goto label_1597e8
            else
                void* r1_10 = *(r0_13 + 0xc)
                
                if (*(r1_10 + 0x88) != 3)
                    goto label_1597b0
                
                bool cond:7_1 = arg2 s<= 1
                
                if (arg2 s>= 1)
                    cond:7_1 = *(r1_10 + 0xa0) s<= arg2
                
                if (not(cond:7_1))
                    goto label_1597b0
        else
            void* r1_7 = *(r0_9 + 0xc)
            
            if (*(r1_7 + 0x88) != 3)
                goto label_159778
            
            bool cond:5_1 = arg2 s<= 1
            
            if (arg2 s>= 1)
                cond:5_1 = *(r1_7 + 0xa0) s<= arg2
            
            if (not(cond:5_1))
                goto label_159778
    else
        void* r1_4 = *(r0_5 + 0xc)
        
        if (*(r1_4 + 0x88) != 3)
            goto label_159740
        
        bool cond:3_1 = arg2 s<= 1
        
        if (arg2 s>= 1)
            cond:3_1 = *(r1_4 + 0xa0) s<= arg2
        
        if (not(cond:3_1))
            goto label_159740
else
    void* r1_1 = *(r0_1 + 0xc)
    
    if (*(r1_1 + 0x88) != 3)
        goto label_159708
    
    bool cond:1_1 = arg2 s<= 1
    
    if (arg2 s>= 1)
        cond:1_1 = *(r1_1 + 0xa0) s<= arg2
    
    if (not(cond:1_1))
        goto label_159708

return 1
